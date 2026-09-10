public interface StarterStage {
    StarterStage isVegan();
    StarterStage isGlutenFree();
    MainCourseStage withMainCourse(String mainCourse);
}
