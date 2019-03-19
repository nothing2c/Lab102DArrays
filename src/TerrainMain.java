public class TerrainMain {
    public static void main(String[] args) {
        TerrainAnalysis terrain = new TerrainAnalysis(5, 7);

        System.out.println(terrain.display());

        System.out.println(terrain.getNumberOfPeaks());
    }
}
