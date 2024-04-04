/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hu.the.vecb52;

/**
 *
 * @author Hallgató
 */

import java.io.IOException;
import java.io.InputStream;
import org.lwjgl.*;
import org.lwjgl.glfw.*;
import org.lwjgl.opengl.*;
import org.lwjgl.system.*;

import java.nio.*;

import static org.lwjgl.glfw.Callbacks.*;
import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;
import org.lwjgl.stb.STBTTFontinfo;
import org.lwjgl.stb.STBTruetype;

public class HelloWorld {

	// The window handle
	private long window;
        private STBTTFontinfo font;

	public void run() {
		System.out.println("Hello LWJGL " + Version.getVersion() + "!");

		init();
		loop();

		// Free the window callbacks and destroy the window
		glfwFreeCallbacks(window);
		glfwDestroyWindow(window);

		// Terminate GLFW and free the error callback
		glfwTerminate();
		glfwSetErrorCallback(null).free();
	}
        
        private void drawText(float x, float y, String text) {
                FloatBuffer xBuffer = BufferUtils.createFloatBuffer(1);
                FloatBuffer yBuffer = BufferUtils.createFloatBuffer(1);

                // Eltoljuk a rajzolás helyét
                glTranslatef(x, y, 0);

                // Kirajzoljuk a szöveget karakterenként
                for (int i = 0; i < text.length(); i++) {
                    char c = text.charAt(i);
                    STBTruetype.stbtt_GetPackedQuad(font, 512, 512, c, xBuffer, yBuffer, null, null);
                    glBegin(GL_QUADS);
                    glTexCoord2f(xBuffer.get(0), yBuffer.get(0));
                    glVertex2f(xBuffer.get(0), yBuffer.get(0));
                    glTexCoord2f(xBuffer.get(0 + 1), yBuffer.get(0 + 1));
                    glVertex2f(xBuffer.get(0 + 1), yBuffer.get(0 + 1));
                    glTexCoord2f(xBuffer.get(0 + 2), yBuffer.get(0 + 2));
                    glVertex2f(xBuffer.get(0 + 2), yBuffer.get(0 + 2));
                    glTexCoord2f(xBuffer.get(0 + 3), yBuffer.get(0 + 3));
                    glVertex2f(xBuffer.get(0 + 3), yBuffer.get(0 + 3));
                    glEnd();
                }

                // Visszaállítjuk a rajzolás helyét
                glLoadIdentity();
            }

	private void init() {
		// Setup an error callback. The default implementation
		// will print the error message in System.err.
		GLFWErrorCallback.createPrint(System.err).set();
                font = STBTTFontinfo.create();
                font = STBTTFontinfo.create();

                // Betűtípus fájl beolvasása
                try (InputStream is = getClass().getResourceAsStream("/path/to/font.ttf")) {
                    byte[] fontBytes = is.readAllBytes();
                    ByteBuffer ttf = ByteBuffer.allocateDirect(fontBytes.length);
                    ttf.put(fontBytes).flip(); // flip() szükséges a buffer átállításához olvasási módra
                    STBTruetype.stbtt_InitFont(font, ttf);
                } catch (IOException e) {
                    e.printStackTrace();
                }



		// Initialize GLFW. Most GLFW functions will not work before doing this.
		if ( !glfwInit() )
			throw new IllegalStateException("Unable to initialize GLFW");

		// Configure GLFW
		glfwDefaultWindowHints(); // optional, the current window hints are already the default
		glfwWindowHint(GLFW_VISIBLE, GLFW_FALSE); // the window will stay hidden after creation
		glfwWindowHint(GLFW_RESIZABLE, GLFW_TRUE); // the window will be resizable

		// Create the window
		window = glfwCreateWindow(300, 300, "Hello VECB52!", NULL, NULL);
		if ( window == NULL )
			throw new RuntimeException("Failed to create the GLFW window");

		// Setup a key callback. It will be called every time a key is pressed, repeated or released.
		glfwSetKeyCallback(window, (window, key, scancode, action, mods) -> {
			if ( key == GLFW_KEY_ESCAPE && action == GLFW_RELEASE )
				glfwSetWindowShouldClose(window, true); // We will detect this in the rendering loop
		});

		// Get the thread stack and push a new frame
		try ( MemoryStack stack = stackPush() ) {
			IntBuffer pWidth = stack.mallocInt(1); // int*
			IntBuffer pHeight = stack.mallocInt(1); // int*

			// Get the window size passed to glfwCreateWindow
			glfwGetWindowSize(window, pWidth, pHeight);

			// Get the resolution of the primary monitor
			GLFWVidMode vidmode = glfwGetVideoMode(glfwGetPrimaryMonitor());

			// Center the window
			glfwSetWindowPos(
				window,
				(vidmode.width() - pWidth.get(0)) / 2,
				(vidmode.height() - pHeight.get(0)) / 2
			);
		} // the stack frame is popped automatically

		// Make the OpenGL context current
		glfwMakeContextCurrent(window);
		// Enable v-sync
		glfwSwapInterval(1);

		// Make the window visible
		glfwShowWindow(window);
	}

	private void loop() {
		// This line is critical for LWJGL's interoperation with GLFW's
		// OpenGL context, or any context that is managed externally.
		// LWJGL detects the context that is current in the current thread,
		// creates the GLCapabilities instance and makes the OpenGL
		// bindings available for use.
		GL.createCapabilities();

		// Set the clear color
		glClearColor(0.0f, 0.0f, 1.0f, 0.0f);
                
		// Run the rendering loop until the user has attempted to close
		// the window or has pressed the ESCAPE key.
		while ( !glfwWindowShouldClose(window) ) {
			glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT); // clear the framebuffer

                        drawText(100, 150, "Hello LWJGL!"); // kiírjuk a szöveget
			glfwSwapBuffers(window); // swap the color buffers

			// Poll for window events. The key callback above will only be
			// invoked during this call.
			glfwPollEvents();
		}
	}

	public static void main(String[] args) {
		new HelloWorld().run();
	}

}