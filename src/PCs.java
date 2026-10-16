import java.util.Objects;

public class PCs {
    private String CPU;
    private String GPU;
    private int RAM;
    private String Storage;

    public PCs(String CPU, String GPU, int RAM, String storage) {
        this.CPU = CPU;
        this.GPU = GPU;
        this.RAM = RAM;
        Storage = storage;
    }

    @Override
    public String toString() {
        return "PC | CPU: " + CPU + " | GPU: " + GPU + " | RAM: " + RAM + " GB | Storage: " + Storage;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        PCs pCs = (PCs) o;
        return RAM == pCs.RAM && Objects.equals(CPU, pCs.CPU) && Objects.equals(GPU, pCs.GPU) && Objects.equals(Storage, pCs.Storage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(CPU, GPU, RAM, Storage);
    }
}
