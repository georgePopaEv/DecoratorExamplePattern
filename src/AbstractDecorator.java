abstract class AbstractDecorator extends Component{

    protected Component component;

    public void SetTheComponent(Component c){
        component = c;
    }


    public void doJob(){
        if (component != null){
            component.doJob();
        }
    }
}

class ConcreteDecoratorEx_1 extends AbstractDecorator{
    public void doJob(){
        super.doJob();

        // add additional responsabilities
        System.out.println("I am explicity from Ex_1");
    }
}

class ConcreteDecoratorEx_2 extends AbstractDecorator {
    public void doJob() {
        System.out.println("");
        System.out.println("*** START EX-2 ***");
        super.doJob();

        // add additional responsabilities
        System.out.println("I am explicity from Ex_2");



        //
    }
}