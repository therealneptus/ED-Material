public class Main {
	private static long stopTime;
	private static long startTime;

	public static void main(String[] args) {
		int n = 45000;
            
		//ex1a(n);
	    //ex1a(4*n);

		//ex1b(2000000000L);
		//ex1b(8000000000L);

		//ex1c(4000000000L);
		//ex1c(4*4000000000L);

		ex1d(100000L);
		ex1d(4*100000L);
	}

	static void ex1b(long n){
		long soma=0;
		startTimer();
		for(long i=0;i<n;i++)
			soma++;
		System.out.println("Soma="+soma);
		stopTimer();
		showTime();
	}

	static void ex1a(long n){
		long soma=0;
		startTimer();
		for(long i=0;i<n;i++)
			for(long j=0;j<n;j++)
				soma++;
		System.out.println("Soma="+soma);
		stopTimer();
		showTime();
	}

	static void ex1c (long n) {
		long soma=0;
		startTimer();

		for (long i=0;i<n;i+=2)
			soma++;

		System.out.println("Soma="+soma);
		stopTimer();
		showTime();
	}

	static void ex1d (long n) {
		long soma=0;
		startTimer();

		for(long i=0;i<1000;i++)
			for(long j=0;j<n;j++)
				soma++;

		System.out.println("Soma="+soma);
		stopTimer();
		showTime();
	}

	static void ex1e (long n) {
		long soma=0;
		startTimer();

		for(long i=0;i<n;i++)
			soma++;
		for(long j=0;j<n;j++)
			soma++;

		System.out.println("Soma="+soma);
		stopTimer();
		showTime();
	}

	static void ex1f (long n) {
		long soma=0;
		startTimer();

		if(n>20000) n=20000;
		for(long i=0;i<n;i++)
			for(long j=0;j<n;j++)
				soma++;

		System.out.println("Soma="+soma);
		stopTimer();
		showTime();
	}

	static void ex1g (long n) {
		long soma=0;
		startTimer();

		for(long i=0;i<n;i++)
			for(long j=0;j<n*n;j++)
				soma++;

		System.out.println("Soma="+soma);
		stopTimer();
		showTime();
	}

	static void ex1h (long n) {
		long soma=0;
		startTimer();

		for(long i=0;i<n;i++)
			for(long j=0;j<i;j++)
				soma ++;

		System.out.println("Soma="+soma);
		stopTimer();
		showTime();
	}

	static void ex1i (long n) {
		long soma=0;
		startTimer();

		for(long i=0;i<n*n;i++)
			for(long j=0;j<i;j++)
				soma ++;

		System.out.println("Soma="+soma);
		stopTimer();
		showTime();
	}

	static void ex1j (long n) {
		long soma=0;
		startTimer();

		for(long i=1;i<n;i*=2)
			soma++;

		System.out.println("Soma="+soma);
		stopTimer();
		showTime();
	}


	private static void showTime() {
		long interval=stopTime-startTime;
		long secs=interval/1000000000L;
		long decs=interval-secs*1000000000L;
		decs/=100000000L;
		System.out.println("secs="+secs+"."+decs);
	}

	private static void stopTimer() {
		stopTime=System.nanoTime();
	}
	private static void startTimer() {
		startTime=System.nanoTime();
	}
}
