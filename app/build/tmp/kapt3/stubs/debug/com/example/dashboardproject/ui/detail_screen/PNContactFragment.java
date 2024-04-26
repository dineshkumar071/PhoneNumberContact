package com.example.dashboardproject.ui.detail_screen;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0002J\b\u0010 \u001a\u00020\u001fH\u0002J\u0012\u0010!\u001a\u00020\u001f2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J$\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\'2\b\u0010(\u001a\u0004\u0018\u00010)2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u001a\u0010*\u001a\u00020\u001f2\u0006\u0010+\u001a\u00020%2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R$\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\r\u0010\u0002\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001b\u00a8\u0006,"}, d2 = {"Lcom/example/dashboardproject/ui/detail_screen/PNContactFragment;", "Lcom/example/dashboardproject/ui/base/TSBaseFragment;", "()V", "PAGE_START", "", "TOTAL_PAGES", "currentPage", "detailScreenBinding", "Lcom/example/dashboardproject/databinding/FragmentDetailScreenBinding;", "detailScreenViewModel", "Lcom/example/dashboardproject/ui/detail_screen/PNContactViewModel;", "detailScreenViewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "getDetailScreenViewModelFactory$annotations", "getDetailScreenViewModelFactory", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "setDetailScreenViewModelFactory", "(Landroidx/lifecycle/ViewModelProvider$Factory;)V", "isLastPage1", "", "isLoading1", "similarShows", "", "Lcom/example/dashboardproject/Repository/Model/ResultOne;", "similarShowsAdapter", "Lcom/example/dashboardproject/ui/detail_screen/ContactAdapter;", "getSimilarShowsAdapter", "()Lcom/example/dashboardproject/ui/detail_screen/ContactAdapter;", "similarShowsAdapter$delegate", "Lkotlin/Lazy;", "loadNextPage", "", "observeViewModel", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "app_debug"})
public final class PNContactFragment extends com.example.dashboardproject.ui.base.TSBaseFragment {
    private com.example.dashboardproject.databinding.FragmentDetailScreenBinding detailScreenBinding;
    @javax.inject.Inject
    public androidx.lifecycle.ViewModelProvider.Factory detailScreenViewModelFactory;
    private com.example.dashboardproject.ui.detail_screen.PNContactViewModel detailScreenViewModel;
    @org.jetbrains.annotations.NotNull
    private java.util.List<com.example.dashboardproject.Repository.Model.ResultOne> similarShows;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy similarShowsAdapter$delegate = null;
    private final int PAGE_START = 25;
    private boolean isLoading1 = false;
    private final boolean isLastPage1 = false;
    private final int TOTAL_PAGES = 28;
    private int currentPage;
    
    public PNContactFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.ViewModelProvider.Factory getDetailScreenViewModelFactory() {
        return null;
    }
    
    @javax.inject.Named(value = "contact")
    @java.lang.Deprecated
    public static void getDetailScreenViewModelFactory$annotations() {
    }
    
    public final void setDetailScreenViewModelFactory(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.ViewModelProvider.Factory p0) {
    }
    
    private final com.example.dashboardproject.ui.detail_screen.ContactAdapter getSimilarShowsAdapter() {
        return null;
    }
    
    @java.lang.Override
    public void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
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
    
    private final void loadNextPage() {
    }
    
    private final void observeViewModel() {
    }
}