class Main {
    public static void main(String[]args) {
        Ocarina zelda = new Ocarina();
    //     zelda.song = "Song of Time";
    // System.out.println(zelda.song);
    zelda.setSong("Song of Time");
    System.out.println("zelda object is currently holding " + zelda.getSong());
    zelda.setSong("Zelda's Lullaby");
    System.out.println("zelda objects new song is:" + zelda.getSong());

    Ocarina link = new Ocarina();
    link.setSong("Epona's Song");
    link.setColor("Blue");

    System.out.println("Link carries a " + link.getColor() + " Ocarina and calls his horse Epona using " + link.getSong() + ". Link meets Zelda at Hyrule Castle and learns " + zelda.getSong() + "!");
    }
}