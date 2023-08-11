package behavioral.chain_of_responsability;

public abstract class ChainProcessor {

    public ChainProcessor nextProcessor;

    public ChainProcessor() {}
    public ChainProcessor(ChainProcessor nextProcessor) {
        this.nextProcessor = nextProcessor;
    }

    public abstract boolean doSomething();
}