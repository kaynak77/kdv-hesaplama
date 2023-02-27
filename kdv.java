     import java'yı içe aktar kullanışlı _ tarayıcı ;

genel  sınıf  ÜçgenAlanHesaplama {
    genel  statik  geçersiz  ana ( String [] args ) {
        Tarayıcı  taraması = yeni  Tarayıcı ( System . in );

        sistem . dışarı _ yazdır ( "1. Kenar: " );
        int  k1 = tarama . nextInt ();

        sistem . dışarı _ print ( "2. Kenar: " );
        int  k2 = tarama . nextInt ();

        çift  ​​hipo = Matematik . sqrt ( k1 * k1 + k2 * k2 );
        sistem . dışarı _ println ( "Hipotenüs: " + hipo );
        
        çift  ​​u = ( k1 + k2 + hipo ) / 2 ;
        çift  ​​alan = Matematik . sqrt ( u * ( u - k1 ) * ( u - k2 ) * ( u - hipo ));

        sistem . dışarı _ printf ( "Alan:%.1f" , alan );

        taramak _ kapat ();
    }
}



     }
       
     }
