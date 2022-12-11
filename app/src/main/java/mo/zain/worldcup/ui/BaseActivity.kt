package mo.zain.worldcup.ui

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding

abstract class BaseActivity<VBL:ViewBinding>: AppCompatActivity() {


    abstract val LOG_TAG:String
    abstract val bindingInflater:(LayoutInflater) ->VBL
    private var _binding:ViewBinding? =null

    protected val binding
        get()  =_binding as VBL?

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        _binding=bindingInflater(layoutInflater)
        setContentView(requireNotNull(_binding).root)

        setUp()
        callBack()
    }
    abstract fun setUp()
    abstract fun callBack()

    protected fun log(value:String){
        Log.i(LOG_TAG,value.toString())
    }

}