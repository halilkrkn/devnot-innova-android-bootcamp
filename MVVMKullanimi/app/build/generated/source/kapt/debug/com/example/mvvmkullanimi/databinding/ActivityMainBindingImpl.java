package com.example.mvvmkullanimi.databinding;
import com.example.mvvmkullanimi.R;
import com.example.mvvmkullanimi.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityMainBindingImpl extends ActivityMainBinding implements com.example.mvvmkullanimi.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.editTextSayi1, 4);
        sViewsWithIds.put(R.id.editTextSayi2, 5);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityMainBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private ActivityMainBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[3]
            , (android.widget.Button) bindings[2]
            , (android.widget.EditText) bindings[4]
            , (android.widget.EditText) bindings[5]
            , (android.widget.TextView) bindings[1]
            );
        this.buttonCarpma.setTag(null);
        this.buttonToplama.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.textViewSonuc.setTag(null);
        setRootTag(root);
        // listeners
        mCallback1 = new com.example.mvvmkullanimi.generated.callback.OnClickListener(this, 1);
        mCallback2 = new com.example.mvvmkullanimi.generated.callback.OnClickListener(this, 2);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.mainActivityNesnesi == variableId) {
            setMainActivityNesnesi((com.example.mvvmkullanimi.MainActivity) variable);
        }
        else if (BR.hesaplamaSonucu == variableId) {
            setHesaplamaSonucu((java.lang.String) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setMainActivityNesnesi(@Nullable com.example.mvvmkullanimi.MainActivity MainActivityNesnesi) {
        this.mMainActivityNesnesi = MainActivityNesnesi;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.mainActivityNesnesi);
        super.requestRebind();
    }
    public void setHesaplamaSonucu(@Nullable java.lang.String HesaplamaSonucu) {
        this.mHesaplamaSonucu = HesaplamaSonucu;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.hesaplamaSonucu);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        com.example.mvvmkullanimi.MainActivity mainActivityNesnesi = mMainActivityNesnesi;
        int integerParseIntHesaplamaSonucu = 0;
        java.lang.String hesaplamaSonucu = mHesaplamaSonucu;
        boolean integerParseIntHesaplamaSonucuInt50 = false;
        int integerParseIntHesaplamaSonucuInt50ViewINVISIBLEViewVISIBLE = 0;
        boolean integerParseIntHesaplamaSonucuInt20 = false;
        int integerParseIntHesaplamaSonucuInt20TextViewSonucAndroidColorTeal700TextViewSonucAndroidColorPurple500 = 0;

        if ((dirtyFlags & 0x6L) != 0) {



                // read Integer.parseInt(hesaplamaSonucu)
                integerParseIntHesaplamaSonucu = java.lang.Integer.parseInt(hesaplamaSonucu);


                // read Integer.parseInt(hesaplamaSonucu) > 50
                integerParseIntHesaplamaSonucuInt50 = (integerParseIntHesaplamaSonucu) > (50);
                // read Integer.parseInt(hesaplamaSonucu) > 20
                integerParseIntHesaplamaSonucuInt20 = (integerParseIntHesaplamaSonucu) > (20);
            if((dirtyFlags & 0x6L) != 0) {
                if(integerParseIntHesaplamaSonucuInt50) {
                        dirtyFlags |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x8L;
                }
            }
            if((dirtyFlags & 0x6L) != 0) {
                if(integerParseIntHesaplamaSonucuInt20) {
                        dirtyFlags |= 0x40L;
                }
                else {
                        dirtyFlags |= 0x20L;
                }
            }


                // read Integer.parseInt(hesaplamaSonucu) > 50 ? View.INVISIBLE : View.VISIBLE
                integerParseIntHesaplamaSonucuInt50ViewINVISIBLEViewVISIBLE = ((integerParseIntHesaplamaSonucuInt50) ? (android.view.View.INVISIBLE) : (android.view.View.VISIBLE));
                // read Integer.parseInt(hesaplamaSonucu) > 20 ? @android:color/teal_700 : @android:color/purple_500
                integerParseIntHesaplamaSonucuInt20TextViewSonucAndroidColorTeal700TextViewSonucAndroidColorPurple500 = ((integerParseIntHesaplamaSonucuInt20) ? (getColorFromResource(textViewSonuc, R.color.teal_700)) : (getColorFromResource(textViewSonuc, R.color.purple_500)));
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.buttonCarpma.setOnClickListener(mCallback2);
            this.buttonToplama.setOnClickListener(mCallback1);
        }
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textViewSonuc, hesaplamaSonucu);
            this.textViewSonuc.setTextColor(integerParseIntHesaplamaSonucuInt20TextViewSonucAndroidColorTeal700TextViewSonucAndroidColorPurple500);
            this.textViewSonuc.setVisibility(integerParseIntHesaplamaSonucuInt50ViewINVISIBLEViewVISIBLE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 1: {
                // localize variables for thread safety
                // mainActivityNesnesi
                com.example.mvvmkullanimi.MainActivity mainActivityNesnesi = mMainActivityNesnesi;
                // mainActivityNesnesi != null
                boolean mainActivityNesnesiJavaLangObjectNull = false;



                mainActivityNesnesiJavaLangObjectNull = (mainActivityNesnesi) != (null);
                if (mainActivityNesnesiJavaLangObjectNull) {


                    if ((editTextSayi1) != (null)) {


                        editTextSayi1.getText();
                        if ((editTextSayi1.getText()) != (null)) {


                            editTextSayi1.getText().toString();

                            if ((editTextSayi2) != (null)) {


                                editTextSayi2.getText();
                                if ((editTextSayi2.getText()) != (null)) {


                                    editTextSayi2.getText().toString();

                                    mainActivityNesnesi.buttonToplamaTikla(editTextSayi1.getText().toString(), editTextSayi2.getText().toString());
                                }
                            }
                        }
                    }
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // mainActivityNesnesi
                com.example.mvvmkullanimi.MainActivity mainActivityNesnesi = mMainActivityNesnesi;
                // mainActivityNesnesi != null
                boolean mainActivityNesnesiJavaLangObjectNull = false;



                mainActivityNesnesiJavaLangObjectNull = (mainActivityNesnesi) != (null);
                if (mainActivityNesnesiJavaLangObjectNull) {


                    if ((editTextSayi1) != (null)) {


                        editTextSayi1.getText();
                        if ((editTextSayi1.getText()) != (null)) {


                            editTextSayi1.getText().toString();

                            if ((editTextSayi2) != (null)) {


                                editTextSayi2.getText();
                                if ((editTextSayi2.getText()) != (null)) {


                                    editTextSayi2.getText().toString();

                                    mainActivityNesnesi.buttonCarpmaTikla(editTextSayi1.getText().toString(), editTextSayi2.getText().toString());
                                }
                            }
                        }
                    }
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): mainActivityNesnesi
        flag 1 (0x2L): hesaplamaSonucu
        flag 2 (0x3L): null
        flag 3 (0x4L): Integer.parseInt(hesaplamaSonucu) > 50 ? View.INVISIBLE : View.VISIBLE
        flag 4 (0x5L): Integer.parseInt(hesaplamaSonucu) > 50 ? View.INVISIBLE : View.VISIBLE
        flag 5 (0x6L): Integer.parseInt(hesaplamaSonucu) > 20 ? @android:color/teal_700 : @android:color/purple_500
        flag 6 (0x7L): Integer.parseInt(hesaplamaSonucu) > 20 ? @android:color/teal_700 : @android:color/purple_500
    flag mapping end*/
    //end
}