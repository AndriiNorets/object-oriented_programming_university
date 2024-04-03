package memory;

public interface MamoryManager {
    abstract void allocateMemory(int size);

    default void freeMemory() {
        System.out.println("Memory Freed");
    }

    static String getMemoryType() {
        return "Memory Type";
    }

}
class RAMManager implements MamoryManager{

    @Override
    public void allocateMemory(int size) {
        System.out.println("Allocating RAM Memory");
    }

}
class DiskManager implements MamoryManager{

    @Override
    public void allocateMemory(int size) {
        System.out.println("Allocating Disk Space");
    }


}
