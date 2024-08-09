public class FormaterCep {

	public static void main(String[] args) {

		try {
			String cepFormatado = formatarCep("1234567");
			System.out.println(cepFormatado);
		} catch (CepInvalidException e) {
			System.err.print("O cep não corresponde com as regras de negócios!");
		}
		
	}

	public static String formatarCep(String cep) throws CepInvalidException{
		if (cep.length() != 8) 
			throw new CepInvalidException();
			
			return "12.345-678";
	}

}
