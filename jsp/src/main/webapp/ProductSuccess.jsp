<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Product Success</title>
    <!-- Include Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
    <div class="container">
        <h1 class="mt-4">Product Information</h1>
        <div>
            <p>Product Name: ${name1}</p>
            <p>Type: ${type1}</p>
            <p>Price: ${price1}</p>
            <p>Brand: ${brand1}</p>
            <p>Quantity: ${quantity1}</p>
            
        </div>

        <p>Price2: ${price2}</p>

        <div>
        <p>Total Price: ${totalPrice}</p></div>
      
    </div>

    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
