<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Edit Product</title>
    <!-- Include Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <!-- Include your custom CSS file (style.css) for additional styling -->
    <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
    <div class="container">
        <h1 class="mt-4">Edit Product</h1>
        <form action="ProductSuccess.jsp" method="post">
            <div class="form-group">
                <label for="name">Name:</label>
                <input type="text" id="name" name="name2" class="form-control" value="Shoe" readonly>
            </div>

            <div class="form-group">
                <label for="type">Type:</label>
                <select id="type" name="type2" class="form-control" disabled>
                    <option value="Product Type">Sports Shoe</option>
                    <option value="Product Type">Formal Shoe</option>
                    
                </select>
                <input type="hidden" name="selectedType" value="Sports Shoe">
            </div>

            <div class="form-group">
    <label for="price2">Price (Product2):</label>
    <input type="number" id="price2" name="price2" class="form-control" step="0.01" required>
</div>

            <div class="form-group">
                <label for="brand">Brand:</label>
                <input type="text" id="brand" name="brand2" class="form-control" value="Liberty" readonly>
            </div>

            <div class="form-group">
                <label for="quantity">Quantity:</label>
                <input type="text" id="quantity" name="quantity2" class="form-control" value="1 pieces" readonly>
            </div>

            <div class="form-group">
                <label for="description">Description:</label>
                <input type="text" id="description" name="description2" class="form-control" value="Product Description" readonly>
            </div>

            <button type="submit" class="btn btn-primary">Send</button>
        </form>
    </div>
   
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
