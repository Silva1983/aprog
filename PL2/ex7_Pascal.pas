Program triangulo;
var a, b, c: real;
uses crt;
Begin
	Writeln("Introduza os lados de um triangulo");
	readln(a, b, c);
	
	If (a == b) and (b == c) and (a == c) Then
		Writeln("Triangulo equilátero!");
	else
		if (a == b) or (a == c) or (b == c) Then
			Writeln("Trianglo isosceles!");
		else
			if (a <> b) and (b <> c) and (a <> c) Then	
				Writeln("Triangulo Escaleno") 
end.