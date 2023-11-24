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
       
         <form action="ProductServlet" method="post">
          <span> ${totalPrice}</span>
            <div class="form-group">
                <label for="name1">Name:</label>
                <input type="text" id="name1" name="name1" class="form-control" value="Shoe" readonly>
            </div>

            <div class="form-group">
                <label for="type1">Type:</label>
                <select id="type1" name="type1" class="form-control" disabled>
                    <option value="Product Type">Sports Shoe</option>
                    <option value="Product Type">Formal Shoe</option>
                    
                </select>
                <input type="hidden" name="selectedType" value="Sports Shoe">
            </div>

           <div class="form-group">
    <label for="price1">Price:</label>
    <input type="number" id="price1" name="price1" class="form-control" step="0.01" required>
</div>

            <div class="form-group">
                <label for="brand1">Brand:</label>
                <input type="text" id="brand1" name="brand1" class="form-control" value="Liberty" readonly>
            </div>

            <div class="form-group">
                <label for="quantity1">Quantity:</label>
                <input type="text" id="quantity1" name="quantity1" class="form-control" value="1 pieces" readonly>
            </div>

            <div class="form-group">
                <label for="description1">Description:</label>
                <input type="text" id="description" name="description1" class="form-control" value="Product Description" readonly>
            </div>

            <button type="submit" class="btn btn-primary">Send</button>
        </form>
    </div>
   
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
