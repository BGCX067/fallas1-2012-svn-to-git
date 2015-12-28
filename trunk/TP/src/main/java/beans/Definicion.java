package beans;

public class Definicion {
	//TODO el array de String quizas haya que cambiarlo por algun otro objeto
	String[] titulos = {
			"Cliente habitual",//0
			"Tipo de Persona",//1
			"Actividad",//2
			"Ingresos",//3
			"Lavado",//4
			"BCRA",//5
			"Movimiento",//6
			"Cuenta",//7
			"P.E.P.",//8
			"Antecedentes Judiciales",//9
			"Veraz",//10
			"Tipo de cuenta",//11
			"Per&iacutedo de inactividad",//12
			"Persona Pol&iacuteticamente Expuesta",//13
			"Importe",//14
			"Moneda",//15
			};
	String[] definiciones = {
			"Persona o Entidad con capacidades de realizar transacciones dentro del banco. Entre sus atributos se encuentran: actividad principal, ingresos, persona pol&iacuteticamente expuesta, calificaci&oacuten veraz, antecedentes judiciales, cantidad de cuentas abiertas, entro en concurso, inhabilitaci&oacuten judicial, embargos AFIP, etc.",
			"Puede ser:<br>* Persona Jur&iacutedica: Una persona jur&iacutedica o persona moral es un sujeto de derechos y obligaciones que existe f&iacutesicamente pero no como individuo, sino como instituci&oacuten y que es creada por una o m&aacutes personas f&iacutesicas para cumplir un papel. <br>* ONG: Es una entidad de car&oacutecter civil  o social, con diferentes fines integrantes, creada independientemente de los gobiernos ya sea locales, regionales y nacionales.   <br>* Persona fisica: Cliente com&uacuten, personas de existencia visible, de existencia real, f&iacutesica o natural.",
			"Actividad principal a la que se dedica el cliente. La actividad de las empresas o clientes se sit&uacutea en un contexto de universalizaci&oacuten.", 
			"Hace referencia a las cantidades de dinero que recibe una empresa o persona por la venta de sus productos o servicios, en un año calendario.",
			"Es el proceso de ocultar dinero proveniente de actividades il&iacutecitas y todas las actividades que se realicen para hacerlo aparecer como l&iacutecito.", 		
			"Organismo regulador del sistema financiero de la Rep&uacuteblica Argentina", 
			"Dep&oacutesitos, extracciones, transacciones y dem&aacutes operaciones que se registran en la entidad bancaria.",
			"Contrato financiero que se utilizar para registrar los movimientos realizador por un cliente en el banco. Puede ser Caja de ahorro, TC cuenta corriente, cuenta plazo fijo, caja de ahorro especial para persona jur&iacutedica.",
			"Las Personas Politicamente Expuestas son aquellas que desempe&ntilde;an o han desempe&ntilde;ado funciones p&uacuteblicas destacadas en un determinado pa&iacutes. Esta categor&iacutea incluye, por ejemplo, jefes de estado o de gobierno, pol&iacuteticos de alta jerarqu&iacutea, funcionarios de gobierno, judiciales o militares, altos ejecutivos de empresas estatales y funcionarios importantes de partido pol&iacuteticos, que debido a su condici&oacuten especial de PEP, por razones pol&iacuteticas dentro de sus pa&iacuteses de origen o quiz&aacutes diplom&aacuteticas cuando se desempe&ntilde;an en el extranjero, reciben un trato diferencial y de suma discreci&oacuten.",
			"Ingresos, egresos y testimonios de condena y otros registros de Resoluciones Judiciales aplicadas a la persona.",
			"Empresa dedicada al mantenimiento de informaci&oacuten comercial. Mantiene un registro de las deudas de personas y empresas que los bancos le informan. Dependiendo de las deudas y el comportamiento de pagos del cliente, Veraz imputa un nivel de riesgo, siendo 1 el comportamiento ideal: Buen pagador.",
			"Forma en que la entidad bancaria registra la cuenta. A partir del tipo de cuenta, se definen los tipos de operaciones que podr&aacuten realizarse.",
			"Cantidad de d&iacuteas desde el &uacuteltimo movimiento de la cuenta",
			"Indica si una persona se encuentra en la base de datos de personas pol&iacuteticamente expuestas.",
			"Monto por el que el banco acredita o debita al cliente",
			"Indica la moneda en que se se registran los movimientos en la cuenta.",
			};
	String titulo;
	String definicion;
	public String getTitulo(int id) {
		
		return titulos[id];
	}

	public String getDefinicion(int id) {
		return definiciones[id];
	}


}
