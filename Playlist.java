import java.util.ArrayList;

class Playlist {
  public static void main(String[] args) {
    ArrayList<String> desertIslandPlaylist = new ArrayList<String>();
    desertIslandPlaylist.add("forget him");
    desertIslandPlaylist.add("take me to church");
    desertIslandPlaylist.add("my heart will go on");
    desertIslandPlaylist.add("more than you know");
    desertIslandPlaylist.add("renegade");
    desertIslandPlaylist.add("somebody that i used to know tronicbox 80's remix");
    desertIslandPlaylist.add("better now");

    System.out.println(desertIslandPlaylist);

    //System.out.println(desertIslandPlaylist.size());

    desertIslandPlaylist.remove("better now");

    //System.out.println(desertIslandPlaylist.size());

    desertIslandPlaylist.remove("forget him");

    //System.out.println(desertIslandPlaylist.size());

    int indA = desertIslandPlaylist.indexOf("my heart will go on");
    int indB = desertIslandPlaylist.indexOf("more than you know");

    String tempA = "my heart will go on";
    String tempB = "more than you know";

    desertIslandPlaylist.set(indA, tempA);
    desertIslandPlaylist.set(indB, tempB);

    System.out.println(desertIslandPlaylist);

  }
}
