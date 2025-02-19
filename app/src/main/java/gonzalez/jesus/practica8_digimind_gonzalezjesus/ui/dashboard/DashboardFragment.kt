package gonzalez.jesus.practica8_digimind_gonzalezjesus.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import gonzalez.jesus.practica8_digimind_gonzalezjesus.R
import gonzalez.jesus.practica8_digimind_gonzalezjesus.databinding.FragmentDashboardBinding

class DashboardFragment : Fragment() {

    private  lateinit var dashboardViewModel: DashboardViewModel
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val dashboardViewModel =
            ViewModelProvider(this).get(DashboardViewModel::class.java)

        val root: View = inflater.inflate(R.layout.fragment_dashboard, container, false)

        dashboardViewModel.text.observe(viewLifecycleOwner,{

        })
        return root
    }

}