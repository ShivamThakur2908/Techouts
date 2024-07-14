package assessment;

public class TraineeStudyMaterial {
    private Trainee trainee;
    private StudyMaterial studyMaterial;

    public TraineeStudyMaterial(Trainee trainee, StudyMaterial studyMaterial) {
        this.trainee = trainee;
        this.studyMaterial = studyMaterial;
    }

    // Getters and setters
    public Trainee getTrainee() {
        return trainee;
    }

    public void setTrainee(Trainee trainee) {
        this.trainee = trainee;
    }

    public StudyMaterial getStudyMaterial() {
        return studyMaterial;
    }

    public void setStudyMaterial(StudyMaterial studyMaterial) {
        this.studyMaterial = studyMaterial;
    }
}

