package com.example.dashboardproject.ui.detail_screen;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u0015\u0016B#\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\b\u0010\u000b\u001a\u00020\fH\u0016J\u001c\u0010\r\u001a\u00020\u000e2\n\u0010\u000f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\fH\u0016J\u001c\u0010\u0011\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/example/dashboardproject/ui/detail_screen/ContactAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/dashboardproject/ui/detail_screen/ContactAdapter$ViewHolder;", "mContext", "Landroid/content/Context;", "similarShows", "", "Lcom/example/dashboardproject/Repository/Model/ResultOne;", "showSimilarShowClickListener", "Lcom/example/dashboardproject/ui/detail_screen/ContactAdapter$ShowSimilarShowClickListener;", "(Landroid/content/Context;Ljava/util/List;Lcom/example/dashboardproject/ui/detail_screen/ContactAdapter$ShowSimilarShowClickListener;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ShowSimilarShowClickListener", "ViewHolder", "app_debug"})
public final class ContactAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.dashboardproject.ui.detail_screen.ContactAdapter.ViewHolder> {
    @org.jetbrains.annotations.NotNull
    private final android.content.Context mContext = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.example.dashboardproject.Repository.Model.ResultOne> similarShows = null;
    @org.jetbrains.annotations.NotNull
    private final com.example.dashboardproject.ui.detail_screen.ContactAdapter.ShowSimilarShowClickListener showSimilarShowClickListener = null;
    
    public ContactAdapter(@org.jetbrains.annotations.NotNull
    android.content.Context mContext, @org.jetbrains.annotations.NotNull
    java.util.List<com.example.dashboardproject.Repository.Model.ResultOne> similarShows, @org.jetbrains.annotations.NotNull
    com.example.dashboardproject.ui.detail_screen.ContactAdapter.ShowSimilarShowClickListener showSimilarShowClickListener) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.example.dashboardproject.ui.detail_screen.ContactAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.example.dashboardproject.ui.detail_screen.ContactAdapter.ViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00e6\u0080\u0001\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/example/dashboardproject/ui/detail_screen/ContactAdapter$ShowSimilarShowClickListener;", "", "onClickSimilarShows", "", "position", "", "trend", "Lcom/example/dashboardproject/Repository/Model/ResultOne;", "app_debug"})
    public static abstract interface ShowSimilarShowClickListener {
        
        public abstract void onClickSimilarShows(int position, @org.jetbrains.annotations.NotNull
        com.example.dashboardproject.Repository.Model.ResultOne trend);
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/dashboardproject/ui/detail_screen/ContactAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/dashboardproject/databinding/AdapterSimilarShowsBinding;", "(Lcom/example/dashboardproject/ui/detail_screen/ContactAdapter;Lcom/example/dashboardproject/databinding/AdapterSimilarShowsBinding;)V", "getBinding", "()Lcom/example/dashboardproject/databinding/AdapterSimilarShowsBinding;", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final com.example.dashboardproject.databinding.AdapterSimilarShowsBinding binding = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull
        com.example.dashboardproject.databinding.AdapterSimilarShowsBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.example.dashboardproject.databinding.AdapterSimilarShowsBinding getBinding() {
            return null;
        }
    }
}