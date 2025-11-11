class SortContext {
    private SortStrategy strategy;
    public SortContext(SortStrategy s) { this.strategy = s; }
    public void setStrategy(SortStrategy s) { this.strategy = s; }
    public int[] sort(int[] data) { return strategy.sort(data); }
}