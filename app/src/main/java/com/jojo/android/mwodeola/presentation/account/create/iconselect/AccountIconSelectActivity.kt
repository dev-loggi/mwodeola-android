package com.jojo.android.mwodeola.presentation.account.create.iconselect

import android.content.pm.PackageManager
import android.graphics.ColorMatrix
import android.graphics.ColorMatrixColorFilter
import android.os.Bundle
import android.widget.Toast
import com.jojo.android.mwodeola.databinding.ActivityAccountGroupIconSelectBinding

import com.jojo.android.mwodeola.presentation.BaseActivity
import com.jojo.android.mwodeola.presentation.common.IconView

class AccountIconSelectActivity : BaseActivity(), AccountIconSelectContract.View {
    companion object {
        const val TAG = "AccountIconSelectActivity"
        const val EXTRA_ACCOUNT_GROUP = "extra_account_group"
        const val EXTRA_RESULT_ICON_TYPE = "extra_result_icon_type"
    }

    override val isScreenLockEnabled: Boolean = true
    override val binding by lazy { ActivityAccountGroupIconSelectBinding.inflate(layoutInflater) }

    private val presenter: AccountIconSelectContract.Presenter
            by lazy { AccountIconSelectPresenter(this) }

    private val apps by lazy { packageManager.getInstalledApplications(PackageManager.GET_META_DATA) }

//    private lateinit var accountGroup: AccountGroup

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

//        accountGroup = intent.getSerializableExtra(EXTRA_ACCOUNT_GROUP) as AccountGroup

        with (binding) {
//            iconDefault.setText(accountGroup.name)

//            if (accountGroup.appPackageName != null) {
//                iconInstalledApp.setImageIcon(
//                    apps.find { it.packageName == accountGroup.appPackageName }
//                        ?.loadIcon(packageManager)
//                )
//            } else {
//                iconInstalledApp.setMaskView(R.drawable.outline_question_mark_24)
//            }
//
//            btnClose.setOnClickListener { finish() }
//
//            containerIconDefault.setOnClickListener { finishWithResult(AccountGroup.IconType.TEXT) }
//            containerIconInstalledApp.setOnClickListener {
//                if (accountGroup.appPackageName != null) {
//                    finishWithResult(AccountGroup.IconType.INSTALLED_APP_LOGO)
//                } else {
//                    showToastForUnSupported()
//                }
//            }
//            containerIconExtractedFromUrl.setOnClickListener { showToastForUnSupported() }
//            containerIconInServer.setOnClickListener { showToastForUnSupported() }
//            containerIconUserCustom.setOnClickListener { showToastForUnSupported() }
        }

//        setGrayScaleFilter(binding.iconExtractedFromUrl)
//        setGrayScaleFilter(binding.iconInServer)


    }

//    private fun finishWithResult(iconType: AccountGroup.IconType) {
//        setResult(RESULT_OK, Intent().apply { putExtra(EXTRA_RESULT_ICON_TYPE, iconType) })
//        finish()
//    }

//    private fun setGrayScaleFilter(iconView: IconView) {
//        if (iconView.colorFilter == null) {
//            val matrix = ColorMatrix().apply {
//                setSaturation(0f)
//            }
//            val colorFilter = ColorMatrixColorFilter(matrix)
//
//            iconView.colorFilter = colorFilter
//            iconView.imageAlpha = 128
//        } else {
//            iconView.colorFilter = null
//            iconView.imageAlpha = 255
//        }
//    }

    private fun showToastForUnSupported() {
        Toast.makeText(baseContext, "미지원 기능입니다.", Toast.LENGTH_SHORT).show()
    }
}