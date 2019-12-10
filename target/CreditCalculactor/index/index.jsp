<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <style>
        .slidecontainer {
            width: 60%;
            margin-left: 20%;
            margin-top: 5%;
        }

        .slider {
            -webkit-appearance: none;
            width: 100%;
            height: 15px;
            border-radius: 5px;
            background: #d3d3d3;
            outline: none;
            opacity: 0.7;
            -webkit-transition: .2s;
            transition: opacity .2s;
        }

        .slider:hover {
            opacity: 1;
        }

        .slider::-webkit-slider-thumb {
            -webkit-appearance: none;
            appearance: none;
            width: 25px;
            height: 25px;
            border-radius: 50%;
            background: #4CAF50;
            cursor: pointer;
        }

        .slider::-moz-range-thumb {
            width: 25px;
            height: 25px;
            border-radius: 50%;
            background: #4CAF50;
            cursor: pointer;
        }
        .value{
            margin-left: 45%;
        }
        .left{
            margin-left: 20%;
        }
        .right{
            margin-left: 80%;
        }
    </style>
</head>
<body>

<h1>Round Range Slider</h1>

<div class="slidecontainer">
    <span id = "left">hello ${minSum}</span> <span id="right">${maxSum}</span><input type="range" min="1" max="100" value="50" class="slider" id="myRange">
<p class="value"><span id="demo"></span></p>
</div>

<script>
    var slider = document.getElementById("myRange");
    var output = document.getElementById("demo");
    output.innerHTML = slider.value;

    slider.oninput = function() {
        output.innerHTML = this.value;
    }
</script>

</body>
</html>