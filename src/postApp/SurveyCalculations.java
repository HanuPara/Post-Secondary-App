package postApp;

public class SurveyCalculations {
	
	private String[] programs = new String[15];// The list of programs
	
	public SurveyCalculations() {
		Initialize.isSurveyCompleted = true;
		createProgramArray();//Set the answers to the questions
		calculateProgram();//Find the matching program
	}
	//Each program corresponds to the answers of the questions
	private void createProgramArray() {
		programs[0] = "Mechanical Engineering";
		programs[1] = "Nanotechnology Engineering";
		programs[2] = "Computer Engineering";
		programs[3] = "Electrical Engineering";
		programs[4] = "Software Engineering";
		programs[5] = "Biomedical Engineering";
		programs[6] = "Biomedical Engineering";
		programs[7] = "Chemical Engineering";
		programs[8] = "Civil Engineering";
		programs[9] = "Aerospace Engineering";
		programs[10] = "Mining Engineering";
		programs[11] = "Environmental Engineering";
		programs[12] = "Manufacturing Engineering";
		programs[13] = "Architectural Engineering/Management";
		programs[14] = "Undeclared Engineering";//Undeclared is chosen if 5 is chosen more than once because the questions are specific to programs

	}

	private int calculateProgram() {

		final int HIGHEST = 5;//The highest answer
		int max = 0;// the number of times 5 is chosen
		int index = 0;//the index where five is chosen

		for (int i = 0; i <15; i++) {

			if (Initialize.surveyAnswers[i]+1 == HIGHEST) {
				index = i;
				++max;
			}
			if(max>1) {
				index = 14;
				break;
			}
		}

		return index;

	}
	//returns the program recommended to the user
	public String getRecommendation() {
		return programs[calculateProgram()];
	}
	
}
