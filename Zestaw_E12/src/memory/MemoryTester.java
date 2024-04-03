package memory;

public class MemoryTester {
    public static void main(String[] args) {
        DiskManager dm = new DiskManager();
        RAMManager rm = new RAMManager();

        dm.allocateMemory(4);
        dm.freeMemory();
        System.out.println(MamoryManager.getMemoryType());

        rm.allocateMemory(4);
        rm.freeMemory();
        System.out.println(MamoryManager.getMemoryType());

    }

}
