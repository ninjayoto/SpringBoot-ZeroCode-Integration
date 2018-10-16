package com.xp.springboot.integrationtest;

import org.jsmart.zerocode.core.domain.JsonTestCase;
import org.jsmart.zerocode.core.domain.TargetEnv;
import org.jsmart.zerocode.core.runner.ZeroCodeUnitRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

@TargetEnv("application_host.properties")
@RunWith(ZeroCodeUnitRunner.class)
public class TestPostOperation {

	@Test
    @JsonTestCase("integration_tests/post/post_register_at_parkrun.json")
    public void test_parkRunRegistration() throws Exception {
    }
	
}
