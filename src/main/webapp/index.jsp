<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<script type="text/javascript" src="http://localhost:7001/hr-mvc/script/jquery-2.1.1.min.js"></script>

<h2>Hello World!</h2>

<form action="welcome/search_region.htm" method="post">
    <input type="input" id="regionName" name="regionName" style="color: red;background-color: yellow;"/>
    <input type="submit" value="Show All Regions">
</form>

<form action="welcome/showRegionReport.htm" method="get">
    <input type="input" id="regionId" name="regionId" style="color: red;background-color: yellow;"/>
    <input type="submit" value="Show Report" formtarget="_blank">
</form>

</body>
<script type="text/javascript">
    $('#regionName').change(function () {
        $.ajax({
            type: "GET",
            url: "http://localhost:7001/hr-mvc/welcome/checkDuplicateRegion.htm",
            data: {"regionName": $(this).val()},
            dataType: "text",
            accepts: "text/html",
            error: function (error) {
                if (error.status == 403) {
                    $(this).val('');
                    $(this).css();
                }
            }
        });
    });

</script>
</html>
