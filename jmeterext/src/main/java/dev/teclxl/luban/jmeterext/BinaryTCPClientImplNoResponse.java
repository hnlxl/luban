package dev.teclxl.luban.jmeterext;

import java.io.InputStream;

import org.apache.jmeter.protocol.tcp.sampler.BinaryTCPClientImpl;
import org.apache.jmeter.protocol.tcp.sampler.ReadException;
import org.apache.jmeter.samplers.SampleResult;

/**
 * @author Liu Xiaolei
 * @date 2018/03/31
 */
public class BinaryTCPClientImplNoResponse extends BinaryTCPClientImpl {

    /**
     * Do not need response. Therefore, the sampler cannot be asserted. It is always correct, unless an exception is
     * thrown.
     */
    @Override
    public String read(InputStream is, SampleResult sampleResult) throws ReadException {
        sampleResult.latencyEnd();
        return "Do not need response";
    }

}
