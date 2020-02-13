function CalculateArea(){
        var radius =document.form1.txtRadius.value;
        document.write("<P>The area of the circle for radius "+radius+" = " + (radius * radius * Math.PI) + "</p>");
    }