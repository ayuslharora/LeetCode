class FizzBuzz {
    private int n;
    Semaphore num = new Semaphore(1);
    Semaphore Fizz = new Semaphore(0);
    Semaphore Buzz = new Semaphore(0);
    Semaphore FizzBuzz = new Semaphore(0);
    int currNum;
    boolean done = false;



    public FizzBuzz(int n) {
        this.n = n;
        currNum = 1;
    }

    void release(){
        currNum++;
        if(currNum>n){
            done = true;
            num.release();
            Fizz.release();
            Buzz.release();
            FizzBuzz.release();
        }

        if(currNum%15==0){
            FizzBuzz.release();
        }else if(currNum%5==0){
            Buzz.release();
        }else if(currNum%3==0){
            Fizz.release();
        }else{
            num.release();
        }
    }

    // printFizz.run() outputs "fizz".
    public void fizz(Runnable printFizz) throws InterruptedException {
        while(true){
            Fizz.acquire();
            if(done||currNum>n){
                break;
            }
            printFizz.run();
            release();
        }
    }

    // printBuzz.run() outputs "buzz".
    public void buzz(Runnable printBuzz) throws InterruptedException {
        while(true){
            Buzz.acquire();
            if(done||currNum>n){
                break;
            }
            printBuzz.run();
            release();
        }
    }

    // printFizzBuzz.run() outputs "fizzbuzz".
    public void fizzbuzz(Runnable printFizzBuzz) throws InterruptedException {
        while(true){
            FizzBuzz.acquire();
            if(done||currNum>n){
                break;
            }
            printFizzBuzz.run();
            release();
        }
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public void number(IntConsumer printNumber) throws InterruptedException {
        while(true){
            num.acquire();
            if(done||currNum>n){
                break;
            }
            printNumber.accept(currNum);
            release();
        }
    }
}