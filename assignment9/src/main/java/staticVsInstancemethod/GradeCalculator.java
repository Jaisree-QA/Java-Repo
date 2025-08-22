package staticVsInstancemethod;

public class GradeCalculator {
	private String grade;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GradeCalculator gc = new GradeCalculator();
		System.out.println(gc.isPassingGrade(80));
		System.out.println(gc.getLetterGrade(95));
		System.out.println(gc.isPerfectScore(100));
		System.out.println(gc.needsImprovement(69));
	}

	public boolean isPassingGrade(int score) { // - returns true if score >= 60
		if (score >= 60) {
			return true;
		}
		return false;
	}

	public String getLetterGrade(int score) { // - returns String ("A", "B", "C", "D", "F")

		switch (score/10) {
		case 10:
			grade = "Excellent";
			break;
		case 9:
			grade = "A";
			break;
		case 8:
			grade = "B";
			break;
		case 7:
			grade = "C";
			break;
		default:
			grade = "F";
			break;
		}
		return grade;
	}

	public boolean isPerfectScore(int score) { // - returns true if score is 100

		if (score == 100) {
			return true;
		}
		return false;
	}

	public boolean needsImprovement(int score) { // - returns true if score < 70
		if (score < 70) {
			return true;
		}
		return false;
	}

}
