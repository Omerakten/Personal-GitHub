	import java.util.Scanner;
public class KelimeBulmaca {
	
	

		public static void main(String[] args) {
			Scanner scan= new Scanner(System.in);
			System.out.println("Kelime oyununa ho�geldiniz");
			System.out.println("");
			
			System.out.println("Oyunu ba�latmak i�in enter'a bas�n");
	System.out.println("TOPLAM 3 HAKKIN VAR ");
			try{System.in.read();}				// herhangi bi tu�a bast���nda ba�latma tu�u
			        catch(Exception e){}
			

			// Sorular burda	
			String[] sorular= {  
					
			"Soru1: �elik y�zeyleri film tabakas� gibi kaplay�p paslanmaya kar��k koruyan bir element",
			"Soru2:Erzak odas�",
			"Soru3:Y�resel amca",
			"Soru4:�lgi �ekmek, g�n�l �elmek i�in tak�n�lan ho�, aldat�c� tav�r",
			"Soru5:�lk olarak 'karayollar�ndaki konaklama tesisleri' i�in kullan�l�rken zamanla anlam� geni�leyen bir s�z",
			"Soru6:Birine veya bir �eye y�ksek de�er vermekten do�an duygu",
			"Soru7:�i�ekli bitkilerin �reme arac� olan toz",
			"Soru8:D��� yal�tkan i�i iletken"
			
			};
			
			String[] cevaplar= new String[8];
			cevaplar[0]="Krom";	//Soru1
			cevaplar[1]="Kiler";	//Soru2
			cevaplar[2]="Emmi";	//Soru3
			cevaplar[3]="��ve";	//Soru4
			cevaplar[4]="Motel";	//Soru5
			cevaplar[5]="Sayg�";	//Soru6
			cevaplar[6]="Polen";	//Soru7
			cevaplar[7]="Kablo";	//Soru8
			
			String cevap;
			int harf=0;
			int hak=3;
			
			for (int  i= 0; i < sorular.length; i++) {
				
				System.out.println(sorular[i]);	// SORU BURDA GELD�
				
				for (int j = 1; j <=3; j++) {
					
					System.out.println("Harf almak istiyosan 1 e bas");
					System.out.println("devam etmek istiyosan 0 a bas");	
					harf= scan.nextInt();
					if (harf==1) {
						System.out.println(cevaplar[i].substring(0,j));
						
						hak--;
						System.out.println(hak+" hak kald�");
						if(hak==0) {
							
							break;
						}
								
					}
					else if(harf==0) 
						break;
				}
				
					System.out.println("Cevap gir");
					
					cevap= scan.next();
					
					if(cevap.equals(cevaplar[i])) {
						System.out.println("do�ru");
					}
					else
					{
						
						System.out.println("Yanl��");
						System.out.print("Oyun kapand� tekrar denemek i�in ba�lat");
						System.exit(1);
					}			

				
				
			}
			
			
			
			
			
			
			
		}

	}



