package test.uniswap.jvm.contracts.v3.core;

import java.math.BigInteger;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.http.HttpService;
import org.web3j.tx.gas.ContractGasProvider;
import org.web3j.tx.gas.StaticGasProvider;

import uniswap.jvm.contracts.v2.core.UniswapV2Factory;

public class CheckIfPoolContractWorks {
    @Test
    void testName() throws Exception {
        Web3j e = Web3j.build(new HttpService("https://polygon-rpc.com/"));
        Credentials cr = Credentials.create("0x0");
        ContractGasProvider cgp = new StaticGasProvider(BigInteger.ZERO, BigInteger.ZERO);
        UniswapV2Factory factory = UniswapV2Factory.load("0x5757371414417b8C6CAad45bAeF941aBc7d3Ab32", e, cr, cgp);
        String pool = factory.getPair(
                "0x2791bca1f2de4661ed88a30c99a7a9449aa84174", 
                "0x7ceB23fD6bC0adD59E62ac25578270cFf1b9f619")
                .send();
        Assertions.assertEquals("0x853ee4b2a13f8a742d64c8f088be7ba2131f670d", pool);
    }
}
