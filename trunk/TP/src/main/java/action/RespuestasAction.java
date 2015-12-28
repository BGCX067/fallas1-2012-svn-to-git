package action;

import java.util.Map;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import drools.MotroInferenciaDrools;

@SuppressWarnings("serial")
public class RespuestasAction extends ActionSupport{

	private int[] resps = new int[17];
	
	private String respuesta_1;
	private String respuesta_2;
	private String respuesta_3;
	private String respuesta_4;
	private String respuesta_5;
	private String respuesta_6;
	private String respuesta_7;
	private String respuesta_8;
	private String respuesta_9;
	private String respuesta_10;
	private String respuesta_11;
	private String respuesta_12;
	private String respuesta_13;
	private String respuesta_14;
	private String respuesta_15;
	private String respuesta_16;
	private String respuesta_17;
	
	@SuppressWarnings("unchecked")
	public String execute(){
		MotroInferenciaDrools mt = new MotroInferenciaDrools();

		this.cargarRespuestas();
				
		String resultado = mt.diagnosticar(resps);
		//aca se tiene que pasar al jsp
		@SuppressWarnings("rawtypes")
		Map session = ActionContext.getContext().getSession();
        session.put("resultado", resultado);
		return "success";
	}
	
	private void cargarRespuestas() {
		for (int j=0; j<17; j++) {
			resps[j] = -1;
		}
		if(getRespuesta_1() != null) {
			resps[0] = Integer.parseInt(getRespuesta_1());
		}
		if(getRespuesta_2() != null) {
			resps[1] = Integer.parseInt(getRespuesta_2());
		}
		if(getRespuesta_3() != null) {
			resps[2] = Integer.parseInt(getRespuesta_3());
		}
		if(getRespuesta_4() != null) {
			resps[3] = Integer.parseInt(getRespuesta_4());
		}
		if(getRespuesta_5() != null) {
			resps[4] = Integer.parseInt(getRespuesta_5());
		}
		if(getRespuesta_6() != null) {
			resps[5] = Integer.parseInt(getRespuesta_6());
		}
		if(getRespuesta_7() != null) {
			resps[6] = Integer.parseInt(getRespuesta_7());
		}
		if(getRespuesta_8() != null) {
			resps[7] = Integer.parseInt(getRespuesta_8());
		}
		if(getRespuesta_9() != null) {
			resps[8] = Integer.parseInt(getRespuesta_9());
		}
		
		if(getRespuesta_10() != null) {
			resps[9] = Integer.parseInt(getRespuesta_10());
		}
		
		if(getRespuesta_11() != null) {
			resps[10] = Integer.parseInt(getRespuesta_11());
		}
		
		if(getRespuesta_12() != null) {
			resps[11] = Integer.parseInt(getRespuesta_12());
		}
		
		if(getRespuesta_13() != null) {
			resps[12] = Integer.parseInt(getRespuesta_13());
		}
		
		if(getRespuesta_14() != null) {
			resps[13] = Integer.parseInt(getRespuesta_14());
		}
		
		if(getRespuesta_15() != null) {
			resps[14] = Integer.parseInt(getRespuesta_15());
		}
		
		if(getRespuesta_16() != null) {
			resps[15] = Integer.parseInt(getRespuesta_16());
		}
		
		if(getRespuesta_17() != null) {
			resps[16] = Integer.parseInt(getRespuesta_17());
		}
	}

	public String getRespuesta_9() {
		return respuesta_9;
	}

	public void setRespuesta_9(String respuesta_9) {
		this.respuesta_9 = respuesta_9;
	}

	public String getRespuesta_10() {
		return respuesta_10;
	}

	public void setRespuesta_10(String respuesta_10) {
		this.respuesta_10 = respuesta_10;
	}

	public String getRespuesta_11() {
		return respuesta_11;
	}

	public void setRespuesta_11(String respuesta_11) {
		this.respuesta_11 = respuesta_11;
	}

	public String getRespuesta_12() {
		return respuesta_12;
	}

	public void setRespuesta_12(String respuesta_12) {
		this.respuesta_12 = respuesta_12;
	}

	public String getRespuesta_13() {
		return respuesta_13;
	}

	public void setRespuesta_13(String respuesta_13) {
		this.respuesta_13 = respuesta_13;
	}

	public String getRespuesta_14() {
		return respuesta_14;
	}

	public void setRespuesta_14(String respuesta_14) {
		this.respuesta_14 = respuesta_14;
	}

	public String getRespuesta_15() {
		return respuesta_15;
	}

	public void setRespuesta_15(String respuesta_15) {
		this.respuesta_15 = respuesta_15;
	}

	public String getRespuesta_16() {
		return respuesta_16;
	}

	public void setRespuesta_16(String respuesta_16) {
		this.respuesta_16 = respuesta_16;
	}

	public String getRespuesta_17() {
		return respuesta_17;
	}

	public void setRespuesta_17(String respuesta_17) {
		this.respuesta_17 = respuesta_17;
	}

	public void setRespuesta_1(String respuesta_1) {
		this.respuesta_1 = respuesta_1;
	}

	public String getRespuesta_1() {
		return respuesta_1;
	}

	public void setRespuesta_2(String respuesta_2) {
		this.respuesta_2 = respuesta_2;
	}

	public String getRespuesta_2() {
		return respuesta_2;
	}

	public void setRespuesta_3(String respuesta_3) {
		this.respuesta_3 = respuesta_3;
	}

	public String getRespuesta_3() {
		return respuesta_3;
	}

	public void setRespuesta_4(String respuesta_4) {
		this.respuesta_4 = respuesta_4;
	}

	public String getRespuesta_4() {
		return respuesta_4;
	}

	public void setRespuesta_5(String respuesta_5) {
		this.respuesta_5 = respuesta_5;
	}

	public String getRespuesta_5() {
		return respuesta_5;
	}

	public void setRespuesta_6(String respuesta_6) {
		this.respuesta_6 = respuesta_6;
	}

	public String getRespuesta_6() {
		return respuesta_6;
	}

	public void setRespuesta_7(String respuesta_7) {
		this.respuesta_7 = respuesta_7;
	}

	public String getRespuesta_7() {
		return respuesta_7;
	}

	public void setRespuesta_8(String respuesta_8) {
		this.respuesta_8 = respuesta_8;
	}

	public String getRespuesta_8() {
		return respuesta_8;
	}
	
}
