package chatSdk.asyncSdk.model.useLess;


import chatSdk.mainmodel.ResultDeleteMessage;
import chatSdk.asyncSdk.model.BaseOutPut;

public class OutPutDeleteMessage extends BaseOutPut {
    private ResultDeleteMessage result ;

    @Override
    public void setErrorCode(long errorCode) {
        super.setErrorCode(errorCode);
    }

    @Override
    public void setErrorMessage(String errorMessage) {
        super.setErrorMessage(errorMessage);
    }

    @Override
    public void setHasError(boolean hasError) {
        super.setHasError(hasError);
    }

    public ResultDeleteMessage getResult() {
        return result;
    }

    public void setResult(ResultDeleteMessage result) {
        this.result = result;
    }
}
