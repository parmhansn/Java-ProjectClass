class ProjectTest{
    public static void main(String[] args){
        Project project1 = new Project();
        project1.setName("Nadia");
        project1.setDescription("She is amazing!");

        Project project2 = new Project("David");
        project2.setDescription("He's a great friend!");


        Project project3 = new Project("Anita", "She's simply the most amazing woman ever!");

        System.out.println(project1.elevatorPitch());
        System.out.println(project2.elevatorPitch());
        System.out.println(project3.elevatorPitch());
    }
}