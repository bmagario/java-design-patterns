package behavioral.chain_of_responsability;

    public class ConcreteProcessor2 extends ChainProcessor {

        public ConcreteProcessor2() {
        }
        public ConcreteProcessor2(ChainProcessor nextProcessor) {
            super(nextProcessor);
        }

        @Override
        public boolean doSomething() {
            if (nextProcessor == null) {
                System.out.println("Concrete Processor 2 END");
                return true;
            } else {
                System.out.println("Concrete Processor 2 NEXT");
                return nextProcessor.doSomething();
            }
        }
    }