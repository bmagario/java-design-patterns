package behavioral.chain_of_responsability;

    public class ConcreteProcessor1 extends ChainProcessor {

        public ConcreteProcessor1() {
        }
        public ConcreteProcessor1(ChainProcessor nextProcessor) {
            super(nextProcessor);
        }

        @Override
        public boolean doSomething() {
            if (nextProcessor == null) {
                System.out.println("Concrete Processor 1 END");
                return true;
            } else {
                System.out.println("Concrete Processor 1 NEXT");
                return nextProcessor.doSomething();
            }
        }
    }