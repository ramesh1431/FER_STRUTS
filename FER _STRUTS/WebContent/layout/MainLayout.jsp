<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles"%>
<html>
<head>
<title></title>
<script type="text/javascript">
	function submitForm(urlaction) {
		var form = document.forms[0];
		form.action = urlaction;
		form.submit();
	}
</script>
</head>
<body>
    <table border="10" align="center" width="800px" length="600px">
        <tr>
            <td height="100px" colspan="2" >
            	<tiles:insert attribute="header" />
            </td>
        </tr>
        <tr>
            <td width="150px" height="400px">
            	<tiles:insert attribute="leftFrame" />
            </td>
            <td>
            	<tiles:insert attribute="body" />
            </td>
        </tr>
        <tr>
            <td height="100px" colspan="2">
            	<tiles:insert attribute="footer" />
            </td>
        </tr>
    </table>
</body>

</html>