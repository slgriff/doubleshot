package doubleshot;

public class DisjointSet implements UnionFind {
    private final int[] parent;
    private final int[] size;
    private int numComponents;

    private boolean unionBySize;
    private boolean pathCompression;

    public DisjointSet(int n) {
        if (n < 0) {
            throw new IllegalArgumentException();
        }

        parent = new int[n];
        numComponents = n;
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }
        size = new int[n];
        for (int i = 0; i < n; i++) {
            size[i] = 1;
        }
        unionBySize = true;
        pathCompression = false;
    }

    @Override
    public int find(int n) {
        if (n < 0 || n > parent.length) {
            throw new IllegalArgumentException();
        }

        if (n == parent[n]) {
            return n;
        }

        int parentN = find(parent[n]);
        if (pathCompression) {
            parent[n] = parentN;
        }
        return parentN;
    }

    @Override
    public void union(int n, int m) {
        if (n < 0 || n > parent.length) {
            throw new IllegalArgumentException();
        }

        if (m < 0 || m > parent.length) {
            throw new IllegalArgumentException();
        }

        int parentN = parent[n];
        int parentM = parent[m];
        if (parentN != parentM) {
            if (unionBySize) {
                if (size[parentM] < size[parentN]) {
                    parent[parentM] = parentN;
                    size[parentM] += size[parentN];
                } else {
                    parent[parentN] = parentM;
                    size[parentN] += size[parentM];
                }
            } else {
                parent[parentM] = parentN;
                size[parentM] += size[parentN];
            }
            numComponents--;
        }
    }

    @Override
    public int getNumberOfComponents() {
        return numComponents;
    }

    @Override
    public int getComponentSize(int n) {
        if (n < 0 || n > parent.length) {
            throw new IllegalArgumentException();
        }

        return size[n];
    }

    @Override
    public boolean inSameComponent(int n, int m) {
        if (n < 0 || n > parent.length) {
            throw new IllegalArgumentException();
        }

        if (m < 0 || m > parent.length) {
            throw new IllegalArgumentException();
        }

        return find(n) == find(m);
    }

    @Override
    public void enablePathCompression(boolean enabled) {
        pathCompression = enabled;
    }

    @Override
    public void enableUnionBySize(boolean enabled) {
        unionBySize = enabled;
    }
}
