package icici;

import io.nuls.contract.sdk.Contract;
import io.nuls.contract.sdk.annotation.Payable;
import io.nuls.contract.sdk.annotation.Required;
import io.nuls.contract.sdk.annotation.View;

public class SimpleStorage implements Contract {

    private String storedData;

    @View
    public String getStoredData() {
        return storedData;
    }

    @Payable
    public void setStoredData(@Required String storedData) {
        this.storedData = storedData;
    }

}