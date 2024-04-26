package com.example.dashboardproject.ui.image_poster;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 $2\u00020\u0001:\u0001$B\u0005\u00a2\u0006\u0002\u0010\u0002J$\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u001a\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u001a2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R$\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087.\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\t\u0010\u0002\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006%"}, d2 = {"Lcom/example/dashboardproject/ui/image_poster/PNRandomFragment;", "Lcom/example/dashboardproject/ui/base/TSBaseFragment;", "()V", "imagePosterBinding", "Lcom/example/dashboardproject/databinding/FragmentImagePosterBinding;", "imagePosterViewModel", "Lcom/example/dashboardproject/ui/image_poster/PNRandomViewModel;", "imagePosterViewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "getImagePosterViewModelFactory$annotations", "getImagePosterViewModelFactory", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "setImagePosterViewModelFactory", "(Landroidx/lifecycle/ViewModelProvider$Factory;)V", "isEnableSearchView", "", "posterAdapter", "Lcom/example/dashboardproject/ui/image_poster/TSImagePosterAdapter;", "getPosterAdapter", "()Lcom/example/dashboardproject/ui/image_poster/TSImagePosterAdapter;", "posterAdapter$delegate", "Lkotlin/Lazy;", "trendings", "", "Lcom/example/dashboardproject/Repository/Model/PhoneNumber;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", "view", "Companion", "app_debug"})
public final class PNRandomFragment extends com.example.dashboardproject.ui.base.TSBaseFragment {
    private com.example.dashboardproject.databinding.FragmentImagePosterBinding imagePosterBinding;
    @org.jetbrains.annotations.NotNull
    private java.util.List<com.example.dashboardproject.Repository.Model.PhoneNumber> trendings;
    @javax.inject.Inject
    public androidx.lifecycle.ViewModelProvider.Factory imagePosterViewModelFactory;
    private com.example.dashboardproject.ui.image_poster.PNRandomViewModel imagePosterViewModel;
    private boolean isEnableSearchView = false;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy posterAdapter$delegate = null;
    @org.jetbrains.annotations.Nullable
    private static java.util.List<com.example.dashboardproject.Repository.Model.PhoneNumber> contactList;
    @org.jetbrains.annotations.NotNull
    public static final com.example.dashboardproject.ui.image_poster.PNRandomFragment.Companion Companion = null;
    
    public PNRandomFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.ViewModelProvider.Factory getImagePosterViewModelFactory() {
        return null;
    }
    
    @javax.inject.Named(value = "random")
    @java.lang.Deprecated
    public static void getImagePosterViewModelFactory$annotations() {
    }
    
    public final void setImagePosterViewModelFactory(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.ViewModelProvider.Factory p0) {
    }
    
    private final com.example.dashboardproject.ui.image_poster.TSImagePosterAdapter getPosterAdapter() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004R\"\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\r"}, d2 = {"Lcom/example/dashboardproject/ui/image_poster/PNRandomFragment$Companion;", "", "()V", "contactList", "", "Lcom/example/dashboardproject/Repository/Model/PhoneNumber;", "getContactList", "()Ljava/util/List;", "setContactList", "(Ljava/util/List;)V", "newInstance", "Lcom/example/dashboardproject/ui/image_poster/PNRandomFragment;", "list", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.util.List<com.example.dashboardproject.Repository.Model.PhoneNumber> getContactList() {
            return null;
        }
        
        public final void setContactList(@org.jetbrains.annotations.Nullable
        java.util.List<com.example.dashboardproject.Repository.Model.PhoneNumber> p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.example.dashboardproject.ui.image_poster.PNRandomFragment newInstance(@org.jetbrains.annotations.NotNull
        java.util.List<com.example.dashboardproject.Repository.Model.PhoneNumber> list) {
            return null;
        }
    }
}