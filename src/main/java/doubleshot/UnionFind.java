package doubleshot;

public interface UnionFind {
    int find(int n);

    void union(int n, int m);

    int getNumberOfComponents();

    int getComponentSize(int n);

    boolean inSameComponent(int n, int m);

    void enableUnionBySize(boolean enabled);

    void enablePathCompression(boolean enabled);
}
