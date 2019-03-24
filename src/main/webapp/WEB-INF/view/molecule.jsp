<%@ page language="java" contentType="text/html charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<table align="center" border="1">
	<tr>
		<th>xuhao</th>
		<th>Molecule_ID</th>
		<th>Fingerprint</th>
		<th>Cyp_3a4</th>
		<th>Cyp_2c9</th>
		<th>Cyp_2d6</th>
		<th>Ames_Toxicity</th>
		<th>Fathead_Minnow_Toxicity</th>
		<th>Tetrahymena_Pyriformis_Toxicity</th>
		<th>Honey_Bee</th>
		<th>Cell_Permeability</th>
		<th>LogP</th>
		<th>Renal_Organic_Cation_Transporter</th>
		<th>CLtotal</th>
		<th>Hia</th>
		<th>Biodegradation</th>
		<th>Vdd</th>
		<th>P_Glycoprotein_Inhibition</th>
		<th>NOAEL</th>
		<th>Solubility</th>
		<th>Bbb</th>
	</tr>
	<!-- 遍历数据 -->
<c:forEach items="${molecule_List }" var="molecule" varStatus="varSta">
	<tr>
		<td>${varSta.count }</td>
		<td>${molecule.molecule_ID }</td>
		<td>${molecule.fingerprint }</td>
		<td>${molecule.cyp_3a4 }</td>
		<td>${molecule.cyp_2c9 }</td>
		<td>${molecule.cyp_2d6 }</td>
		<td>${molecule.ames_Toxicity }</td>
		<td>${molecule.fathead_Minnow_Toxicity }</td>
		<td>${molecule.tetrahymena_Pyriformis_Toxicity }</td>
		<td>${molecule.honey_Bee }</td>
		<td>${molecule.cell_Permeability }</td>
		<td>${molecule.logP }</td>
		<td>${molecule.renal_Organic_Cation_Transporter }</td>
		<td>${molecule.cLtotal }</td>
		<td>${molecule.hia }</td>
		<td>${molecule.biodegradation }</td>
		<td>${molecule.vdd }</td>
		<td>${molecule.p_Glycoprotein_Inhibition }</td>
		<td>${molecule.nOAEL }</td>
		<td>${molecule.solubility }</td>
		<td>${molecule.bbb }</td>
	</tr>
</c:forEach>
</table>
</body>
</html>