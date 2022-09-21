	import java.util.Scanner;
public class KelimeBulmaca {
	
	

		public static void main(String[] args) {
			Scanner scan= new Scanner(System.in);
			System.out.println("Kelime oyununa hoþgeldiniz");
			System.out.println("");
			
			System.out.println("Oyunu baþlatmak için enter'a basýn");
	System.out.println("TOPLAM 3 HAKKIN VAR ");
			try{System.in.read();}				// herhangi bi tuþa bastýðýnda baþlatma tuþu
			        catch(Exception e){}
			

			// Sorular burda	
			String[] sorular= {  
					
			"Soru1: Çelik yüzeyleri film tabakasý gibi kaplayýp paslanmaya karþýk koruyan bir element",
			"Soru2:Erzak odasý",
			"Soru3:Yöresel amca",
			"Soru4:Ýlgi çekmek, gönül çelmek için takýnýlan hoþ, aldatýcý tavýr",
			"Soru5:Ýlk olarak 'karayollarýndaki konaklama tesisleri' için kullanýlýrken zamanla anlamý geniþleyen bir söz",
			"Soru6:Birine veya bir þeye yüksek deðer vermekten doðan duygu",
			"Soru7:Çiçekli bitkilerin üreme aracý olan toz",
			"Soru8:Dýþý yalýtkan içi iletken"
			
			};
			
			String[] cevaplar= new String[8];
			cevaplar[0]="Krom";	//Soru1
			cevaplar[1]="Kiler";	//Soru2
			cevaplar[2]="Emmi";	//Soru3
			cevaplar[3]="Ýþve";	//Soru4
			cevaplar[4]="Motel";	//Soru5
			cevaplar[5]="Saygý";	//Soru6
			cevaplar[6]="Polen";	//Soru7
			cevaplar[7]="Kablo";	//Soru8
			
			String cevap;
			int harf=0;
			int hak=3;
			
			for (int  i= 0; i < sorular.length; i++) {
				
				System.out.println(sorular[i]);	// SORU BURDA GELDÝ
				
				for (int j = 1; j <=3; j++) {
					
					System.out.println("Harf almak istiyosan 1 e bas");
					System.out.println("devam etmek istiyosan 0 a bas");	
					harf= scan.nextInt();
					if (harf==1) {
						System.out.println(cevaplar[i].substring(0,j));
						
						hak--;
						System.out.println(hak+" hak kaldý");
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
						System.out.println("doðru");
					}
					else
					{
						
						System.out.println("Yanlýþ");
						System.out.print("Oyun kapandý tekrar denemek için baþlat");
						System.exit(1);
					}			

				
				
			}
			
			
			
			
			
			
			
		}

	}



