package assessment;

public class ManyToManyAssociation {
    public static void main(String[] args) {
        // Create Trainees
        Trainee trainee1 = new Trainee(1L, "Shivam");
        Trainee trainee2 = new Trainee(2L, "Sushma");
        Trainee trainee3 = new Trainee(3L, "Suraj");
        Trainee trainee4 = new Trainee(4L, "Abhimanyu");

        // Create StudyMaterials
        StudyMaterial material1 = new StudyMaterial(1L, "Java Basics");
        StudyMaterial material2 = new StudyMaterial(2L, "Advanced Algorithms");
        StudyMaterial material3 = new StudyMaterial(3L, "Python");
        StudyMaterial material4 = new StudyMaterial(4L, "SQL");

        // Associate Trainees with StudyMaterials
        trainee1.addStudyMaterial(material1);
        trainee1.addStudyMaterial(material2);
        trainee2.addStudyMaterial(material1);
        trainee2.addStudyMaterial(material4);
        trainee3.addStudyMaterial(material1);
        trainee4.addStudyMaterial(material3);
        trainee1.addStudyMaterial(material3);

        // Display StudyMaterials for Trainee1
        System.out.println("Study Materials for Trainee1 (" + trainee1.getName() + "):");
        for (TraineeStudyMaterial tsm : trainee1.getTraineeStudyMaterials()) {
            System.out.println("- " + tsm.getStudyMaterial().getName());
        }
        System.out.println();
        System.out.println("Study Materials for Trainee2 (" + trainee2.getName() + "):");
        for (TraineeStudyMaterial tsm : trainee2.getTraineeStudyMaterials()) {
            System.out.println("- " + tsm.getStudyMaterial().getName());
        }
        System.out.println();
        System.out.println("Study Materials for Trainee3 (" + trainee3.getName() + "):");
        for (TraineeStudyMaterial tsm : trainee3.getTraineeStudyMaterials()) {
            System.out.println("- " + tsm.getStudyMaterial().getName());
        }
        System.out.println();
        System.out.println("Study Materials for Trainee4 (" + trainee4.getName() + "):");
        for (TraineeStudyMaterial tsm : trainee4.getTraineeStudyMaterials()) {
            System.out.println("- " + tsm.getStudyMaterial().getName());
        }
        System.out.println();
        
        
        // Display Trainees for StudyMaterial1
        System.out.println("\nTrainees for StudyMaterial1 (" + material1.getName() + "):");
        for (TraineeStudyMaterial tsm : material1.getTraineeStudyMaterials()) {
            System.out.println("- " + tsm.getTrainee().getName());
        }
        System.out.println();
        System.out.println("\nTrainees for StudyMaterial2 (" + material2.getName() + "):");
        for (TraineeStudyMaterial tsm : material2.getTraineeStudyMaterials()) {
            System.out.println("- " + tsm.getTrainee().getName());
        }
        System.out.println();
        System.out.println("\nTrainees for StudyMaterial3 (" + material3.getName() + "):");
        for (TraineeStudyMaterial tsm : material3.getTraineeStudyMaterials()) {
            System.out.println("- " + tsm.getTrainee().getName());
        }
        System.out.println();
        System.out.println("\nTrainees for StudyMaterial4 (" + material4.getName() + "):");
        for (TraineeStudyMaterial tsm : material4.getTraineeStudyMaterials()) {
            System.out.println("- " + tsm.getTrainee().getName());
        }
    }
}

