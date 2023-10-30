<!DOCTYPE html>
<html>
<head>
    <title>My Basic Web Page</title>
</head>
<body>

<h1>Welcome to My Web Page</h1>

<g:form controller="my" >
   <g:actionSubmit value="DeleteAll"
                onclick="return confirm('Are you sure???')" />
</g:form>



</body>
</html>
