package com.example.dashboardproject.ui.base;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0004H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u0018"}, d2 = {"Lcom/example/dashboardproject/ui/base/TSBaseFragment;", "Landroidx/fragment/app/Fragment;", "()V", "mContext", "Landroid/content/Context;", "getMContext", "()Landroid/content/Context;", "setMContext", "(Landroid/content/Context;)V", "tsFragmentChannel", "Lcom/example/dashboardproject/common/TSFragmentChannel;", "getTsFragmentChannel", "()Lcom/example/dashboardproject/common/TSFragmentChannel;", "setTsFragmentChannel", "(Lcom/example/dashboardproject/common/TSFragmentChannel;)V", "convertJSONtoPOJO", "Lcom/example/dashboardproject/Repository/Model/ResultOne;", "result", "", "convertPOJOtoJSON", "onAttach", "", "context", "Companion", "app_debug"})
public class TSBaseFragment extends androidx.fragment.app.Fragment {
    public android.content.Context mContext;
    public com.example.dashboardproject.common.TSFragmentChannel tsFragmentChannel;
    @org.jetbrains.annotations.NotNull
    public static final com.example.dashboardproject.ui.base.TSBaseFragment.Companion Companion = null;
    
    public TSBaseFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.content.Context getMContext() {
        return null;
    }
    
    public final void setMContext(@org.jetbrains.annotations.NotNull
    android.content.Context p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.dashboardproject.common.TSFragmentChannel getTsFragmentChannel() {
        return null;
    }
    
    public final void setTsFragmentChannel(@org.jetbrains.annotations.NotNull
    com.example.dashboardproject.common.TSFragmentChannel p0) {
    }
    
    @java.lang.Override
    public void onAttach(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String convertPOJOtoJSON(@org.jetbrains.annotations.NotNull
    com.example.dashboardproject.Repository.Model.ResultOne result) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.dashboardproject.Repository.Model.ResultOne convertJSONtoPOJO(@org.jetbrains.annotations.NotNull
    java.lang.String result) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/dashboardproject/ui/base/TSBaseFragment$Companion;", "", "()V", "setFragmentChannel", "", "mTsFragmentChannel", "Lcom/example/dashboardproject/common/TSFragmentChannel;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final void setFragmentChannel(@org.jetbrains.annotations.NotNull
        com.example.dashboardproject.common.TSFragmentChannel mTsFragmentChannel) {
        }
    }
}