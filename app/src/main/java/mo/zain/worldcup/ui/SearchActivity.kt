package mo.zain.worldcup.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import mo.zain.worldcup.R
import mo.zain.worldcup.databinding.ActivitySearchBinding

class SearchActivity : BaseActivity<ActivitySearchBinding>() {
    override val LOG_TAG: String="SEARCH_TAG"
    override val bindingInflater: (LayoutInflater) -> ActivitySearchBinding =ActivitySearchBinding::inflate

    override fun setUp() {

    }

    override fun callBack() {
    }
}