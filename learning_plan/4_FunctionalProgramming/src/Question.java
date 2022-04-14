
public class Question {
	
	private String QuestionName;
	private String QuestionAnswer;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}


	public String getQuestionName() {
		return QuestionName;
	}


	private void setQuestionName(String questionName) {
		
		if(questionName.isEmpty()) {
			throw new IllegalArgumentException(questionName);
		}
		
		QuestionName = questionName;
	}

}
