package name.gudong.model;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;

/**
 * Created by GuDong on 2017/2/7 16:31.
 * Contact with ruibin.mao@moji.com.
 */
public class GankRepoTest {
    @Mock
    private GankApi mGankApi;

    private GankRepo mRepo;

    @Before
    public void setUp() {
        mRepo = new GankRepo(mGankApi);
    }

    @Test
    public void searchGank() throws Exception {
        //assertEquals(1 + 1, 2);
//        mRepo.searchGank("rxJava").;
    }

}