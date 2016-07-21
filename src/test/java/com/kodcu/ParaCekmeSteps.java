
package com.kodcu;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.tr.Diyelimki;
import cucumber.api.java.tr.Eğerki;
import cucumber.api.java.tr.Ozaman;
import org.junit.Assert;

public class ParaCekmeSteps {

    int hesapAcilisMiktari;
    int cekilenParaMiktari;
    int sistemTarafindanVerilenMiktar;
    int hesapKalanMiktari;


    @Diyelimki("^Bankada şu kadar param var (\\d+)TRY$")
    public void bankadaŞuKadarParamVarTRY(int hesapAcilisMiktari) throws Throwable {
        this.hesapAcilisMiktari = hesapAcilisMiktari;
    }

    @Eğerki("^(\\d+)TRY miktarında para çekersem$")
    public void tryMiktarındaParaÇekersem(int cekilenParaMiktari) throws Throwable {
        this.cekilenParaMiktari = cekilenParaMiktari;
    }

    @Ozaman("^Hesabımda da kalan miktarında bu olması beklerim : (\\d+)TRY$")
    public void hesabımdaDaKalanMiktarındaBuOlmasıBeklerimTRY(int hesabimdaKalan) throws Throwable {
        int kalanMiktar = hesapAcilisMiktari - cekilenParaMiktari ;
        Assert.assertEquals(kalanMiktar, hesabimdaKalan);
    }

}