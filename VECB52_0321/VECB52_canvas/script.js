function main() {
    const canvas = document.getElementById('my_canvas');
    const context = canvas.getContext("2d");

    writeText(context);
    drawRectangle(context);
    drawCircle(context);
    drawGradientRectangle(context);
    drawImage(context);

    function writeText(context) {
        const text = "Programtervező informatikus 2024";
        context.font = "30px Arial"; 
        context.fillStyle = "orange"; 
        const textWidth = context.measureText(text).width; 
        const x = (canvas.width - textWidth) / 2; 
        const y = 50;

        context.fillText(text, x, y); 
    }

    function drawRectangle(context) {
        context.strokeStyle = 'blue';
        context.lineWidth = 3;

        const x = 50;
        const y = context.canvas.height - 170;

        const width = 200;
        const height = 120;

        context.strokeRect(x, y, width, height);
    }

    function drawCircle(context) {
        /*******************************
        ***This is the circle drawing***
        *******************************/

        const x = context.canvas.width / 2 + 50;
        const y = context.canvas.height / 2 - 50;
        const radius = 70;
    
        context.beginPath();
        context.arc(x, y, radius, 0, Math.PI * 2);
        context.closePath();
        /***************************************
        ***This is the circle outline drawing***
        ***************************************/

        context.fillStyle = 'yellow';
        context.strokeStyle = 'purple';
        context.lineWidth = 3;
        context.fill();
        context.stroke();
        /****************************************************
        ***This is the white triangle, that cut the circle***
        ****************************************************/

        context.fillStyle = 'white';
        context.beginPath();
        context.moveTo(x + radius, y - radius);
        context.lineTo(x - 10, y - radius - 10);
        context.lineTo(x + radius + 10, y + 100);
        context.closePath();
        context.fill();
    }

    function drawGradientRectangle(context) {
        const x = 75;
        const y = context.canvas.height - 300;
        const width = 150;
        const height = 80;
    
        const gradient = context.createRadialGradient(x + width / 2 - 10, y + height / 2 - 10, 10, x + width / 2 + 20, y + height / 2 + 10, Math.min(width, height));
        gradient.addColorStop(0, 'yellow');
        gradient.addColorStop(0.5, 'purple');
        gradient.addColorStop(1, 'lime');
    
        context.fillStyle = gradient;
        context.fillRect(x, y, width, height);
    }

    function drawImage(context) {
        const img = new Image();
        img.src = 'the.png';
        img.onload = function() {

            const centerX = img.width / 2;
            const centerY = img.height / 2;
    
            const compressedWidth = img.width / 6;
            const compressedHeight = img.height / 4;

            const canvasWidth = context.canvas.width;
            const canvasHeight = context.canvas.height;

            const x = canvasWidth - compressedWidth;
            const y = canvasHeight - compressedHeight;

            context.drawImage(img, centerX - compressedWidth / 2, centerY - compressedHeight / 2, compressedWidth, compressedHeight, x, y, compressedWidth, compressedHeight);
        }
    }
}

document.addEventListener("DOMContentLoaded", function() {
    main();
});
